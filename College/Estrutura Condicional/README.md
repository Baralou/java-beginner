# Estrutura Condicional
### Atividades  Data: 26 Setembro
1.Faça um programa que receba as duas notas
de um aluno, calcule sua média, e que
imprima a sua situação:  
|>= 7 |Aprovado |
|-----|---------| 
|< 7  |Reprovado|

2.Faça um programa que receba 3 notas de um aluno,
calcule e mostre uma mensagem de acordo com sua
média: 


|MÉDIA     | MENSAGEM |
|----------|----------|
|>= 0 e < 3| REPROVADO|
|>= 3 e < 7|EXAME    |
|>= 7 e <= 10| APROVADO|

3.Faça um programa para resolver equações de segundo grau (ax²+bx+c = 0):  
∆ = b²-4*a*c

|∆ < 0| Não existe raíz real|
|-----|---------------------|
|∆ = 0| Existe somente uma raíz real: x = (-b) / (2a)
|∆ > 0 |Existe duas raízes reais: x1 = (-b+√∆) / (2a) & x2 = (-b-√∆) / (2a)

4.Construa um programa paradeterminar se o indivíduo estácom um peso favorável. Essa situação é determinada atravésdo _IMC (Índice de Massa
Corpórea)_ , que é definida como sendo a relação entre o peso _(PESO – em kg)_ e o quadradoda _Altura (ALTURA – em m)_ do indivíduo. Ou seja, ``IMC= PESO/ALTURA2`` e, a situação do peso é determinada pela tabela ao lado:  

|Condição| Situação|
|--------|---------|
IMC abaixo de 20| Abaixo do peso
IMC de 20 até 25| Peso Normal
IMC de 25 até 30 |Sobre Peso
IMC de 30 até 40 |Obeso
IMC de 40 e acima|Obeso Mórbido

5.Suponha que uma bola de massa qualquer seja arremessada para cima
numa velocidade v0. Qual é a velocidade v(t) e sua altura acima do
lançamento h(t) no instante t? A resposta, se desprezamos a resistência
do ar e um conjunto de outras pequenas influências, é:  

|_v(t) = v₀-gt_|
|----
|_h(t) = v₀-gt²/2_|

Escreva um algoritmo que permita que o usuário escolha um
planeta em que quer jogar a bola e solicite v0 e t e, então informa as
particularidades da bola (velocidade e altura).

<p><img src='https://github.com/Baralou/Images/blob/main/Captura%20de%20tela%202022-09-28%20165853.png?raw=true'/></p>

6.Implemente um algoritmo que retorne o valor da função abaixo
após receber um valor qualquer de entrada:

|_f(x)_=|2x+2,|x<-2|
|-------|-----|----|
|_f(x)_= |3,|-2≤x<3|
|_f(x)_=|-x|3≤x|

7.Dados três valores X,Y,Z, verificar se eles
podem ser os comprimentos dos lados de um
triângulo. Se eles não formarem um triângulo
escrever uma mensagem. Considerar que o
comprimento de cada lado de um triângulo é
menor que a soma dos outros dois lados.

8.Faça um programa que receba 2 números e
mostre o seguinte menu:
1. Somar os dois números
2. Multiplicar os dois números
3. Subtrair o número maior pelo número menor (se os dois forem
iguais, retorne zero)
4. Dividir o primeiro número pelo segundo (lembre-se de que não
existe divisão por zero)
De acordo com a opção escolhida, exiba o resultado correspondente.

9.Um determinado hotel cobra R$ 500,00 a
diária e mais uma taxa de serviços. Faça um
programa que leia o número de diárias e calcule
o total a ser pago pelo cliente, sabendo-se que a
taxa de serviços é de:  

|R$ 15,00 por dia,| se número de diárias < 15|
|-----------------|-------------------------|
|R$ 10,00 por dia,| se número de diárias = 15|
R$ 5,00 por dia,| se número de diárias > 15|

10.Uma academia de musculação possui a seguinte tabela para
cobrança da mensalidade de seus clientes:  

|HOMENS |R$|MULHERES| R$|
|-------|--|------|----- |
|até 15 anos |60,00 |até 18 anos| 60,00|
|16 a 18 anos |75,00| 19 a 25 anos| 90,00|
|19 a 30 anos |90,00| 26 a 40 anos |85,00|
|31 a 40 anos |85,00 |Acima de 40 anos |80,00|
|Acima de 40 anos |80,00|--- |--- |

Faça um programa que leia a idade e sexo do cliente, e
imprima o valor da mensalidade que o mesmo deve pagar.

11.Um hotel possui a seguinte tabela para cobrança da diária de
seus clientes:  

|Diárias|Apto Simples R$| Apto Duplo R$|
|------------|--|--------------|                             
|Número de diárias < 10|100,00| 140,00|              
|Número de diárias entre 10 e 15|90,00| 120,00|
Número de diárias > 15|80,00|100,00|



Faça um programa que leia a tipo de apartamento e a
quantidade de dias em que um hóspede esteve no hotel, e
calcule o total a ser pago pelo mesmo.


# English 
# Conditional Structure
### Activities Date: 26 September
1.Make a program that receives both notes
of a student, calculate his average, and that
print your status:
|>= 7 |Approved |
|-----|---------|
|< 7 |Failed|

2.Make a program that receives 3 grades from a student,
calculate and display a message according to your
average:


|AVERAGE | MESSAGE |
|----------|----------|
|>= 0 and < 3| FAIL |
|>= 3 and < 7|EXAM |
|>= 7 and <= 10| PASS |

3. Make a program to solve quadratic equations (ax²+bx+c = 0):
∆ = b²-4*a*c

|∆ < 0| There is no real root|
|-----|---------------------|
|∆ = 0| There is only one real root: x = (-b) / (2a)
|∆ > 0 |There are two real roots: x1 = (-b+√∆) / (2a) & x2 = (-b-√∆) / (2a)

4. Build a program to determine whether the individual is at a favorable weight. This situation is determined through the _BMI (Mass Index
Corporeal)_ , which is defined as the ratio between the weight _(WEIGHT – in kg)_ and the square of the _Height (HEIGHT – in m)_ of the individual. That is, ``BMI= WEIGHT/HEIGHT2`` and the weight situation is determined by the table on the side:

|Condition| Status|
|--------|---------|
BMI below 20| Under weight
BMI from 20 to 25| Normal weight
BMI from 25 to 30 |Overweight
BMI from 30 to 40 |Obese
BMI 40 and above | Morbidly Obese

5.Suppose that a ball of dough is thrown upwards
at a speed v0. What is the speed v(t) and its height above the
launch h(t) at time t? The answer, if we neglect resistance
of the air and a set of other small influences, is:

|_v(t) = v₀-gt_|
|----
|_h(t) = v₀-gt²/2_|

Write an algorithm that allows the user to choose a
planet you want to play the ball on and request v0 and t and then inform the
particularities of the ball (speed and height).

<p><img src='https://github.com/Baralou/Images/blob/main/Captura%20de%20tela%202022-09-28%20165853.png?raw=true'/></p>

6.Implement an algorithm that returns the value of the function below
after receiving any input value:

|_f(x)_=|2x+2,|x<-2|
|-------|-----|----|
|_f(x)_= |3,|-2≤x<3|
|_f(x)_=|-x|3≤x|

7. Given three X,Y,Z values, check if they
can be the lengths of the sides of a
triangle. If they don't form a triangle
write a message. consider that the
length of each side of a triangle is
less than the sum of the other two sides.

8.Make a program that receives 2 numbers and
show the following menu:
1. Add the two numbers
2. Multiply the two numbers
3. Subtract the larger number from the smaller number (if both are
equal, return zero)
4. Divide the first number by the second (remember not
there is division by zero)
According to the option chosen, display the corresponding result.

9. A particular hotel charges BRL 500.00 a
daily rate plus a service charge. Make one
program that reads the number of nights and calculates
the total to be paid by the customer, knowing that the
service fee is:

|R$ 15.00 per day,| if number of nights < 15|
|-----------------|-------------------------|
|R$ 10.00 per day,| if number of nights = 15|
BRL 5.00 per day,| if number of nights > 15|

10. A bodybuilding gym has the following table for
billing your customers' monthly fee:

|MEN |BRL|WOMEN| R$|
|-------|--|------|----- |
|up to 15 years old |60.00 |up to 18 years old| 60.00|
|16 to 18 years old |75.00| 19 to 25 years old| 90.00|
|19 to 30 years old |90.00| 26 to 40 years old |85.00|
|31 to 40 years old |85.00 |Over 40 years old |80.00|
|Over 40 years |80.00|--- |--- |

Make a program that reads the age and gender of the customer, and
print the amount of the monthly fee to be paid.

11. A hotel has the following table for charging the daily rate of
your customers:

|Daily rates|Simple Apartment R$| Double Room R$|
|------------|--|--------------|
|Number of daily rates < 10|100.00| 140.00 |
|Number of nights between 10 and 15|90.00| 120.00 |
Number of nights > 15|80.00|100.00|



Write a program that reads the apartment type and the
number of days a guest was at the hotel, and
calculate the total to be paid for it.