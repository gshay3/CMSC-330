/* 
 * Description: This class represents a Max operation, which is a type of SubExpression.
 * @author Griffin Shay
 */

class Max: public SubExpression
{
public:
    // Constructor initializes the left and right operands for the Max operation.
    Max(Expression* left, Expression* right): SubExpression(left, right){}
    // Compares the left and right operands and returns the higher number.
    double evaluate()
    {
        if(left->evaluate() > right->evaluate())
        {
            return left->evaluate();
        }
        else
        {
            return right->evaluate();
        }
    }
};