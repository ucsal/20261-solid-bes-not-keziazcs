O projeto enviado passou por um processo de refatoração para melhorar a organização do código, mantendo o mesmo funcionamento, mas aplicando boas práticas de programação (ensinadas em sala).


- classe tentativa: 
A lista de respostas estava sendo exposta diretamente, permitindo alterações externas.
 Foi aplicado encapsulamento, retornando uma cópia da lista e criando um método específico paa respostas.

- classe prova: 
Foi adicionada uma validação no título para evitar valores nulos ou vazios, garantindo maior consistência dos dados.

- classe questao: 
Foram removidos valores fixos (quantidade de alternativas), substituindo por uma constante.
 A validação foi ajustada para ficar mais flexível, facilitando futuras mudanças e seguindo melhor o princípio OCP.

- classe resposta: 
O atributo que indicava se a resposta estava correta podia ser alterado externamente.
Foi removido o setter, deixando a responsabilidade mais organizada.


concluindo:
As refatorações foram feitas de forma simples, focando em melhorar a organização, reduzir acoplamento e aplicar princípios básicos do SOLID!
