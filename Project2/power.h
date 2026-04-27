/* 
 * Description: This class represents a Power operation, which is a type of SubExpression.
 * @author Griffin Shay
 */

class Power: public SubExpression
{
public:
    // Constructor initializes the left and right operands for the Power operation.
    Power(Expression* left, Expression* right): SubExpression(left, right){}
    // Evaluates and returns the result of raising the left operand to the power of the right operand.
    double evaluate()
    {
        return pow(left->evaluate(), right->evaluate());
    }
};