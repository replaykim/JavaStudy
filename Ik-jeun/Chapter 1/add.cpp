// std:: 이걸 일일이 선언하면 귀찮지 않음? ㅋㅋ
// 그래서 include 선언후에 using namespace std; 하게되면
// 일일이 std선언을 안해줘도대 하지마 때때로 std namespace를 불러옴에따라
// 일부 c함수가 적용되고 안되는 경우도 있어서 주의해야함
// 어떻게 보면 일일이 std:: 해주는것도 나쁘지 않음.

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

	// 찾아본 결과 (double)a/b 이런식은 old-style cast 라고 함
	// (static_cast<double> a/b) 이게 최신이라네?
	// 참고 -> https://msdn.microsoft.com/ko-kr/library/hh279667.aspx
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
