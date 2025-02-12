#include <iostream>
using std::cout;
using std::endl;
using std::string;

class Shape
{

protected:
    int x;
    int y;

public:
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    void setX(int value)
    {
        x = value;
    }
    void setY(int value)
    {

        y = value;
    }

    Shape(int x, int y)
    {
        this->x = x;
        this->y = y;
    }

    virtual void draw() = 0; // draw metodu alt sınıflarda implemente edilerek tamamlanmak zorundadır. C++ da soyut sınıfların tanımı bu şekilde gerçekleşir.
};

class Triangle : public Shape
{

public:
    void draw() override
    {

        cout << "The triangle has been drawn." << endl;
    }

    Triangle(int x, int y)
        : Shape(x, y) {

          };
};

class Rectangle : public Shape
{
public:
    void draw() override
    {
        cout << "The rectangle has been drawn with parameters(X:Y): " << this->getX() << ":" << this->getY() << endl ;
    }

    Rectangle(int x, int y) : Shape(x,y){}
}; 

int main()
{

    Triangle item1 = Triangle(3, 5);
    item1.draw();

    Rectangle item2 = Rectangle(6,8);
    item2.draw();

    char c = getchar();

    return 0;
}

/*

virtual return_type function_name() = 0;



*/