class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
            int[] count = new int[26];

            for(int i=0; i<word.length(); i++) {
                count[word.charAt(i)- 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();

            for(int value: count) {
                keyBuilder.append("#");
                keyBuilder.append(value);
            }

            String key = keyBuilder.toString();

            if(! groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(word);
        }
        return new ArrayList<>(groups.values());
        
    }
}