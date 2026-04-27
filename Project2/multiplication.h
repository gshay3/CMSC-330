/* 
 * Description: This class represents a Multiplication operation, which is a type of SubExpression.
 * @author Griffin Shay
 */

class Multiplication: public SubExpression
{
public:
    // Constructor initializes the left and right operands for the multiplication operation.
    Multiplication(Expression* left, Expression* right): SubExpression(left, right){}
    // Evaluates and returns the result of multiplying the left operand with the right.
    double evaluate()
    {
        return left->evaluate() * right->evaluate();
    }
};