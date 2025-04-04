_/**
 * This program implements a simple GUI-based calculator using Java Swing.
 * The calculator supports basic arithmetic operations: addition, subtraction,
 * multiplication, and division. It also includes functionality to clear the input
 * and handle division by zero gracefully.
 *
 * Implementation Steps:
 * 1. **Setup the JFrame and JTextField**:
 
 *    - A JFrame is created to serve as the main window for the calculator.
 *    - A non-editable JTextField is added to display user input and results.
 *
 * 2. **Create Buttons**:
 *    - Number buttons (0-9) are created and added to an array for easy management.
 *    - Function buttons (+, -, *, /, =, C) are created and added to another array.
 *
 * 3. **Design the Layout**:
 *    - A JPanel with a GridLayout is used to arrange the buttons in a 4x4 grid.
 *    - Buttons are added to the panel in a logical order for a calculator.
 *
 * 4. **Add Action Listeners**:
 *    - Each button is assigned an ActionListener to handle user interactions.
 *    - Number buttons append their value to the text field when clicked.
 *    - Function buttons perform operations like clearing the input, storing the first number,
 *      and calculating the result based on the selected operator.
 *
 * 5. **Handle Arithmetic Operations**:
 *    - The program uses a switch-case structure to perform the selected operation
 *      when the "=" button is clicked.
 *    - Division by zero is handled with an appropriate error message.
 *
 * 6. **Clear Functionality**:
 *    - The "C" button clears the text field and resets the calculator state.
 *
 * 7. **Error Handling**:
 *    - Input validation is performed to ensure the user enters valid numbers.
 *    - Error messages are displayed for invalid input or division by zero.
 *
 * 8. **Launch the Application**:
 *    - The main method initializes the calculator by creating an instance of the class.
 *
 * This implementation provides a user-friendly interface for performing basic
 * arithmetic operations and demonstrates the use of Java Swing components.
 */
