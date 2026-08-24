import java.util.*;

public class Week7Task10 {

    static class ThroneInheritance {

        String king;
        HashMap<String, List<String>> children = new HashMap<>();
        HashSet<String> dead = new HashSet<>();

        ThroneInheritance(String kingName) {
            king = kingName;
            children.put(king, new ArrayList<>());
        }

        void birth(String parentName, String childName) {
            children.putIfAbsent(childName, new ArrayList<>());
            children.get(parentName).add(childName);
        }

        void death(String name) {
            dead.add(name);
        }

        void dfs(String name, List<String> result) {
            if (!dead.contains(name)) {
                result.add(name);
            }

            for (String child : children.get(name)) {
                dfs(child, result);
            }
        }

        List<String> getInheritanceOrder() {
            List<String> result = new ArrayList<>();
            dfs(king, result);
            return result;
        }
    }

    public static void main(String[] args) {
        ThroneInheritance throne =
            new ThroneInheritance("king");

        throne.birth("king", "andy");
        throne.birth("king", "bob");
        throne.birth("andy", "matt");

        throne.death("bob");

        System.out.println(throne.getInheritanceOrder());
    }
}
