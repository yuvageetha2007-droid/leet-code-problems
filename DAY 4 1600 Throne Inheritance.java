import java.util.*;

class ThroneInheritance {

    class Person {
        String name;
        boolean dead;
        List<Person> children;

        Person(String name) {
            this.name = name;
            this.dead = false;
            this.children = new ArrayList<>();
        }
    }

    private Map<String, Person> map;
    private Person king;

    public ThroneInheritance(String kingName) {
        map = new HashMap<>();
        king = new Person(kingName);
        map.put(kingName, king);
    }
     public void birth(String parentName, String childName) {
        Person parent = map.get(parentName);
        Person child = new Person(childName);

        parent.children.add(child);
        map.put(childName, child);
    }

    public void death(String name) {
        map.get(name).dead = true;
    }

    public List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();
        dfs(king, result);
        return result;
    }

    private void dfs(Person person, List<String> result) {
        if (!person.dead) {
            result.add(person.name);
        }

        for (Person child : person.children) {
            dfs(child, result);
        }
        }
}
        
