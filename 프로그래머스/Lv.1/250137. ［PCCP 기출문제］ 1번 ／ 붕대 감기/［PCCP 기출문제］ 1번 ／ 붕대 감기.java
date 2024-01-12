import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int endTime = attacks[attacks.length -1][0];
        int maxHealth = health;
        Map<Integer, Integer> attackInfo = new HashMap<>();
        Arrays.stream(attacks).forEach(attack -> attackInfo.put(attack[0], attack[1]));
        int consecutive = 0;

        for (int time = 0; time <= endTime; time++) {
            // 공격
            if (attackInfo.containsKey(time)) {
                health = attacked(health, attackInfo.get(time));
                attackInfo.remove(time);
                consecutive = 0;
            }
            // 회복
            else {
                int bonusHeal = getBonusHeal(++consecutive, bandage[0], bandage[2]);
                if (bonusHeal != 0) consecutive = 0; // 추가 회복으로 연속횟수 초기화
                health = heal(maxHealth, health, bandage[1], bonusHeal);
            }

            if (isDeath(health)) return -1;
        }
 
        return health;
    }

    int attacked(int health, int damage) {
        return health - damage;
    }

    int heal(int maxHealth, int health, int heal, int bonusHeal) {
        health += heal;
        health += bonusHeal;
        if (maxHealth <= health) health = maxHealth;
        return health;
    }
    
    int getBonusHeal(int consecutive, int timing, int bonusHeal) {
        return consecutive == timing ? bonusHeal : 0;
    }
    
    boolean isDeath(int health) {
        return health <= 0;
    }
}