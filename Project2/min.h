/* 
 * Description: This class represents a Min operation, which is a type of SubExpression.
 * @author Griffin Shay
 */

class Min: public SubExpression
{
public:
    // Constructor initializes the left and right operands for the Min operation.
    Min(Expression* left, Expression* right): SubExpression(left, right){}
    // Compares and returns the smaller of the left and right operands.
    evaluate()
    {
        if(left->evaluate() < right->evaluate())
        {
            return left->evaluate();
        }
        else
        {
            return right->evaluate();
        }
    }
};