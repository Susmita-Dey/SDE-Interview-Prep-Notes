/*
* Leetcode question: https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/
* Difficulty: Medium
*/

class RemoveSubFolders {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);

        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);

        for (int i = 1; i < folder.length; i++) {
            String lastfolder = ans.get(ans.size() - 1) + "/";

            if (!folder[i].startsWith(lastfolder)) {
                ans.add(folder[i]);
            }
        }

        return ans;
    }

  public static void main(String args[]){
    String[] folder = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
    List<String> ans = removeSubfolders(folder);
  }
}
