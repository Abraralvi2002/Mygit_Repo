//A program of using user defined function with parameter in C
#include <stdio.h>

void show(char name[], int age) {
  printf("Hello I'm %s\n My Age is %d", name, age);
}

int main() {
 show("Abrar",21);
  return 0;
}