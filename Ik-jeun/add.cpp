#include<iostream>

void addr(int a, int b){

	int results;

	results = a+b;
	std::cout<<"덧샘 결과 "<<results<<std::endl;

	results = a-b;
	
	std::cout<<"뺄셈 결과 "<<results<<std::endl;

	results = a*b;

	std::cout<<"곱셈 결과 "<<results<<std::endl;

	double tq;

	tq = (double)a/b;

	std::cout<<"나눗셈 결과"<<tq<<std::endl;
}


int main(){

	int num_valus1 , num_valus2;
	std::cout<<"첫 번쨰 숫자 입력 : ";
	std::cin>>num_valus1;

	std::cout<<"두 번째 값을 입력 : ";
	std::cin>>num_valus2;

	addr(num_valus1 , num_valus2);


	return 0;
}
