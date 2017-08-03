# mvp-dagger2-fragment

- Arquitetura MVP utilizando dagger 2 com teste unitário e teste funcional, o objetivo principal não é ensinar as tecnologias, mais sim
como funciona a arquitetura e seus testes.Mais abaixo estão umas pequenas descrições e seus link para aprendizado. Essas tecnologias são 
um pre-requisito para entender a nossa arquitetura com Dagger2 e MVP.

# Dagger

- O Dagger 2 é um framework mantido pela google que tem por objetivo realizar a injeção de dependência em projetos Android e Java. Ele foi criado a partir do Dagger 1 que foi desenvolvido pela Square. Mais informações obter nesses links abaixo:

https://google.github.io/dagger/
https://blog.mindorks.com/a-complete-guide-to-learn-dagger-2-b4c7a570d99c
https://code.tutsplus.com/tutorials/dependency-injection-with-dagger-2-on-android--cms-23345

# Fragment
  - Um Fragment representa o comportamento ou uma parte da interface do usuário em um Activity. É possível combinar vários fragmentos em uma única atividade para compilar uma IU de vários painéis e reutilizar um fragmento em diversas atividades, nessa arquitetura eu ultilezei 
  fragmentos, e criei uma classe chamada "ManagerFragment" para gerenciar a parte de adicionar, remover e substituir fragmento. Mais informações nesses links abaixo:
  
  https://developer.android.com/training/basics/fragments/creating.html
  http://www.vogella.com/tutorials/AndroidFragments/article.html
  
  # MVP
  
  - Os padrões de arquitetura são fundamentais para mantermos um código limpo, expansível e testável. Estas soluções reconhecidas vem sendo desenvolvidas há anos e oferecem referências indispensáveis para a implementação de projetos robustos, com confiabilidade e dentro dos standards que a indústria espera. Nesse projeto eu utilizei o MVP, por que se adequa bem para filosofia de TDD, onde eu utilizei nesse projeto o (JUnit, Roboletric e Espresso). Mais informações obter nesses links abaixo:
  
  http://www.thiengo.com.br/mvp-android
  https://android.jlelse.eu/android-mvp-for-beginners-25889c500443
  https://www.codeproject.com/Articles/288928/Differences-between-MVC-and-MVP-for-Beginners
  
  #TDD
  
  - Desenvolvimento dirigido por testes é uma técnica de desenvolvimento de software que baseia em um ciclo curto de repetições: primeiramente o desenvolvedor escreve um caso de teste automatizado que define uma melhoria desejada ou uma nova funcionalidade.Mais informações no link abaixo:
  
  https://medium.com/mobility/how-to-do-tdd-in-android-90f013d91d7f
  http://bytes.babbel.com/en/articles/2016-05-20-tdd-in-android.html
  http://rafael-miceli.com.br/tdd/2015/03/28/TDD-Com-Android-RED.html
  https://www.toptal.com/android/testing-like-a-true-green-droid
  
  - Junit  
  
  http://www.vogella.com/tutorials/JUnit/article.html
  http://www.mkyong.com/tutorials/junit-tutorials/
  http://alexzh.com/tutorials/android-testing-unit-testing/
  
  - Roboletric
  
  http://robolectric.org/
  https://github.com/codepath/android_guides/wiki/Unit-Testing-with-Robolectric
  http://alexzh.com/tutorials/android-testing-mockito-robolectric/
  
  - espresso
  
  http://alexzh.com/tutorials/android-testing-espresso-part-3/
  http://alexzh.com/tutorials/android-testing-espresso-uiautomator-together/
  
  
  # Projeto MVP-Dagger2
  
   - tudo começa com uma MainActivity normal, mais no pacote main eu crio 4 classes:
    - MainActivity - classe principal que vai instanciar um fragmento via dagger2, a MainActivity tem uma Interface chamada OnMainActivity, e nesse pacote tem mais duas classes, "MainModule" e "OnMainModule" que são classes do dagger2.
    
    <img width="960" alt="main classes" src="https://user-images.githubusercontent.com/5742609/28947872-3ba13282-7880-11e7-9b32-e06f82b61008.png">

</br>

    - Na Classe MainActivity eu instancio meu Fragmento que é o SplashFragment e o meu gerenciador de Fragmento que é o "ManagerFragment" via dagger 2 

    </br>
    <img width="960" alt="main init" src="https://user-images.githubusercontent.com/5742609/28948214-431db556-7882-11e7-8afd-fe5c5f88bcd5.png">

   - ManagerFragment gerencia esses métodos de adicionar, remover e substituir os fragment conforme a figura abaixo:
   
   <img width="960" alt="managerfragment" src="https://user-images.githubusercontent.com/5742609/28948622-e32de82a-7884-11e7-8532-82a34ca641a6.png">

    
    - No momento que o fragmento "SplashView" é instaciada começamos trabalhar o MVP, conforme mostrado no pacote "splash", nesse pacote eu crio 6 classes
    
    
  
  
  
  
  
  
  
  
  
  
    
  
  
  
  
  
  
  
  
