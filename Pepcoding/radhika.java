import java.util.*;

public class radhika {
    public static List<List<String>> getStatForRequests(int m, List<String> database, List<String> requests) {
        Map<String, AbstractMap.SimpleEntry<String, Integer>> urlMap = new HashMap<>();
        Map<Integer, Integer> userCount = new HashMap<>();
        
        for (String entry : database) {
            String[] parts = entry.split(" ");
            int userId = Integer.parseInt(parts[0]);
            String shortUrl = parts[1];
            String actualUrl = parts[2];
            urlMap.put(shortUrl, new AbstractMap.SimpleEntry<>(actualUrl, userId));
        }
        
        List<List<String>> result = new ArrayList<>();
        
        for (String request : requests) {
            AbstractMap.SimpleEntry<String, Integer> urlInfo = urlMap.get(request);
            String actualUrl = urlInfo.getKey();
            int userId = urlInfo.getValue();
            userCount.put(userId, userCount.getOrDefault(userId, 0) + 1);
            result.add(Arrays.asList(actualUrl, String.valueOf(userCount.get(userId))));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int m = 3;
        List<String> database = Arrays.asList("0 sdsf www.google.com", "1 juytf www.google.com", "0 opoit www.kaggle.com");
        List<String> requests = Arrays.asList("juytf", "sdsf", "opoit");
        
        List<List<String>> result = getStatForRequests(m, database, requests);
        
        for (List<String> res : result) {
            System.out.println("[" + res.get(0) + ", " + res.get(1) + "]");
        }
    }
}
