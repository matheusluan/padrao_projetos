
package com.mycompany.teste;

public class Teste {

    public static void main(String[] args) {
        Npc joker = NpcFactory.create(NpcType.JOKER);
        Npc dragao = NpcFactory.create(NpcType.DRAGAO);
        Npc anfitriao = NpcFactory.create(NpcType.ANFITRIAO);

        joker.atacar(dragao); 
        
        dragao.atacar(joker);
    }
}
