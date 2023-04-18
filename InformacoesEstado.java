import java.util.Scanner;
public class InformacoesEstado {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String sigla;


       do {
           System.out.print("Digite a sigla do estado (ou SAIR para encerrar): ");
           sigla = entrada.nextLine().toUpperCase();


           switch (sigla) {
               case "AC":
                   System.out.println("Nome: Acre");
                   System.out.println("Capital: Rio Branco");
                   System.out.println("População: 894.470 habitantes");
                   System.out.println("PIB: R$ 16,5 bilhões");
                   break;
               case "AL":
                   System.out.println("Nome: Alagoas");
                   System.out.println("Capital: Maceió");
                   System.out.println("População: 3.351.543 habitantes");
                   System.out.println("PIB: R$ 56,3 bilhões");
                   break;
               case "AP":
                   System.out.println("Nome: Amapá");
                   System.out.println("Capital: Macapá");
                   System.out.println("População: 861.773 habitantes");
                   System.out.println("PIB: R$ 10,6 bilhões");
                   break;
               case "AM":
                   System.out.println("Nome: Amazonas");
                   System.out.println("Capital: Manaus");
                   System.out.println("População: 4.207.714 habitantes");
                   System.out.println("PIB: R$ 97,4 bilhões");
                   break;
               case "BA":
                   System.out.println("Nome: Bahia");
                   System.out.println("Capital: Salvador");
                   System.out.println("População: 14.930.634 habitantes");
                   System.out.println("PIB: R$ 277,9 bilhões");
                   break;
               case "CE":
                   System.out.println("Nome: Ceará");
                   System.out.println("Capital: Fortaleza");
                   System.out.println("População: 9.132.078 habitantes");
                   System.out.println("PIB: R$ 163,4 bilhões");
                   break;
               case "DF":
                   System.out.println("Nome: Distrito Federal");
                   System.out.println("Capital: Brasília");
                   System.out.println("População: 3.055.149 habitantes");
                   System.out.println("PIB: R$ 254,8 bilhões");
                   break;
               case "ES":
                   System.out.println("Nome: Espírito Santo");
                   System.out.println("Capital: Vitória");
                   System.out.println("População: 4.064.052 habitantes");
                   System.out.println("PIB: R$ 128,6 bilhões");
                   break;
               case "GO":
                   System.out.println("Nome: Goiás");
                   System.out.println("Capital: Goiânia");
                   System.out.println("População: 7.113.540 habitantes");
                   System.out.println("PIB: R$ 215,8 bilhões");
                   break;
               case "MA":
                   System.out.println("Nome: Maranhão");
                   System.out.println("Capital: São Luís");
                   System.out.println("População: 7.114.598 habitantes");
                   System.out.println("PIB: R$ 97.340 bilhões");
                   break;
               case "MT":
                   System.out.println("Nome: Mato Grosso");
                   System.out.println("Capital: Cuiabá");
                   System.out.println("População:  3.526.220 habitantes ");
                   System.out.println("PIB: R$ 178.650 bilhões");
                   break;
               case "MS":
                   System.out.println("Nome: Mato Grosso do Sul");
                   System.out.println("Capital: Campo Grande");
                   System.out.println("População:  2.809.394 habitantes ");
                   System.out.println("PIB: R$ 122.628 bilhões");
                   break;
               case "MG":
                   System.out.println("Nome: Minas Gerais");
                   System.out.println("Capital: Mato Grosso");
                   System.out.println("População: 21.292.666 habitantes");
                   System.out.println("PIB: R$ 682.786 bilhões");
                   break;
               case "PA":
                   System.out.println("Nome: Pará");
                   System.out.println("Capital: Belém");
                   System.out.println("População: 8.690.745 habitantes");
                   System.out.println("PIB: R$ 215.936 bilhões");
                   break;
               case "PB":
                   System.out.println("Nome: Paraíba");
                   System.out.println("Capital: João Pessoa");
                   System.out.println("População: 4.039.277 habitantes");
                   System.out.println("PIB: R$ 70.292 bilhões");
                   break;
               case "PR":
                   System.out.println("Nome: Paraná");
                   System.out.println("Capital: Curitiba");
                   System.out.println("População: 11.516.840 habitantes");
                   System.out.println("PIB: R$ 487.931 bilhões");
                   break;
               case "PE":
                   System.out.println("Nome: Pernambuco");
                   System.out.println("Capital: Recife");
                   System.out.println("População: 9.616.621 habitantes");
                   System.out.println("PIB: R$ 193.307 bilhões");
                   break;
               case "PI":
                   System.out.println("Nome: Piauí");
                   System.out.println("Capital: Teresina");
                   System.out.println("População: 3.281.480 habitantes");
                   System.out.println("PIB: R$ 56.391 bilhões");
                   break;
               case "RJ":
                   System.out.println("Nome: Rio de Janeiro");
                   System.out.println("Capital: Rio de Janeiro");
                   System.out.println("População: 17.366.189 habitantes");
                   System.out.println("PIB: R$ 753.824 bilhões");
                   break;
               case "RN":
                   System.out.println("Nome: Rio Grande do Norte");
                   System.out.println("Capital: Natal");
                   System.out.println("População: 3.534.165 habitantes");
                   System.out.println("PIB: R$ 71.577 bilhões");
                   break;
               case "RS":
                   System.out.println("Nome: Rio Grande do Sul");
                   System.out.println("Capital: Porto Alegre");
                   System.out.println("População: 11.422.973 habitantes");
                   System.out.println("PIB: R$ 470.942 bilhões");
                   break;
               case "RO":
                   System.out.println("Nome: Rondônia");
                   System.out.println("Capital: Porto Velho");
                   System.out.println("População: 1.796.460 habitantes");
                   System.out.println("PIB: R$ 51.599 bilhões");
                   break;
               case "SC":
                   System.out.println("Nome: Santa Catarina");
                   System.out.println("Capital: Florianópolis");
                   System.out.println("População: 7.252.502 habitantes");
                   System.out.println("PIB: R$ 349.275 bilhões");
                   break;
               case "SE":
                   System.out.println("Nome: Sergipe");
                   System.out.println("Capital: Aracaju");
                   System.out.println("População: 2.318.822 habitantes");
                   System.out.println("PIB: R$ 45.410 bilhões");
                   break;
               case "SP":
                   System.out.println("Nome: São Paulo");
                   System.out.println("Capital: São Paulo");
                   System.out.println("População: 46.289.333 habitantes");
                   System.out.println("PIB: R$ 2.377.639 bilhões");
                   break;
               case "TO":
                   System.out.println("Nome: Tocantins");
                   System.out.println("Capital: Palmas");
                   System.out.println("População: 1.590.248 habitantes");
                   System.out.println("PIB: R$ 43.650 bilhões");
                   break;
               case "SAIR":
                   System.out.println("Encerrando sistema");
                   break; }
           }


       while (false) ;




       }
};
