package main

import "fmt"

func main() {
	var x, y int
	fmt.Println("Enter two numbers: ")
	fmt.Scanln(&x, &y)
	var choice rune
	fmt.Println("Enter the operand (+, -, *, /):")
	fmt.Scanf("%c", &choice)
	var result float64
	valid := true

	switch choice {
	case '+':
		result = float64(x + y)
	case '-':
		result = float64(x - y)
	case '*':
		result = float64(x * y)
	case '/':
		if y != 0 {
			result = float64(x) / float64(y)
		} else {
			fmt.Println("The number is not divisible by 0")
			valid = false
		}
	}

	if valid {
		fmt.Printf("the result: %.2f\n", result)
	}
}
