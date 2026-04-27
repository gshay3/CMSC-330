/* 
 * Description: This class represents a Remainder operation, which is a type of SubExpression.
 * @author Griffin Shay
 */

class Remainder: public SubExpression
{
public:
    // Constructor intitializes the left and right operands for the Remainder operation.
    Remainder(Expression* left, Expression* right): SubExpression(left, right){}
    // Evaluates and returns the remainder when the left operand is divided by the right operand.
    double evaluate()
    {
        return left->evaluate() % right->evaluate();
    }
};