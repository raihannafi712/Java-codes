package lab7.task1;

public class BrowserHistory {
    public int countMain;
    private String[] historyMainOld;
    private int currentIndex;
  
    public BrowserHistory(int size) {

      historyMainOld = new String[size];
      countMain = 0;
      currentIndex = -1;
    }
  
    public void visitWeb(String url) {

      if (countMain < historyMainOld.length) {
        
        countMain++;
        currentIndex++;
        historyMainOld[currentIndex] = url;
        System.out.println("Visited: " + url);
      } else {

        System.out.println("historyMainOld is full. Cannot visit " + url + " web page.");
      }
    }
  
    public void showhistoryMainOld() {

      if (countMain == 0) {
        System.out.println("No web pages visited yet.");
      } else {

        System.out.println("Browser historyMainOld:");
        for (int i = 0; i < countMain; i++) {

          System.out.println(historyMainOld[i]);
        }
      }
    }
  
    public void currentWeb() {

      if (currentIndex == -1) {

        System.out.println("You have not visited any website yet!");
      } else {

        System.out.println("Current web page: " + historyMainOld[currentIndex]);
      }
    }
  
    public void back() {

      if (currentIndex > -1) {

        currentIndex--;
        countMain--;
      }
    }
}  
