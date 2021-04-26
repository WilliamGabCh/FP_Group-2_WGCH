#include <iostream>
int main(){
  printf("Ejercicio 01: Area de un triangulo \n");
  //declarar variables
  int b,h,area;
  std::cout<<"ingrese base: ";
  std::cin>>b;
  std::cout<<"ingrese altura: ";
  std::cin>>h;
  //operacion
  area=b*h/2;
  //salida
  std::cout<<"el Area del triangulo es "<<area;
  return 0;
}