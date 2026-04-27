/* 
 * Description: This class represents a Division operation, which is a type of SubExpression.
 * @author Griffin Shay
 */

class Division: public SubExpression
{
public:
    // Constructor initializes the left and right operands for the division operation.
    Division(Expression* left, Expression* right): SubExpression(left, right){}
    // Evaluates and returns the result of dividing the left operand by the right.
    double evaluate()
    {
        return left->evaluate() / right->evaluate();
    }
};
