class Format {
///수직 거리///

    private static void readPreferences() {
        InputStream is = null;  // InputStream이 함수 맨 처음에 선언 되어있다.
        try {
            is = new FileInputStream(getPreferencesFile());
            setPreferences(new Properties(getPreferences()));
            getPreferences().load(is);
        } catch (IOException e) {
            try {
                if (is != null)
                    is.close();
            } catch (IOException e1) {
            }
        }
    }


    public int countTestCases() {
        int count = 0;
        for (Test each : tests) //루프 제어 변수는 Test each처럼 루프 문 내부에 선언
            count += each.countTestCases();
        return count;
    }


        for (XmlTest test : m_suite.getTests()) {
        TestRunner tr = m_runnerFactory.newTestRunner(this, test);
        // 드물지만, 긴 함수에서는 블록 상단이나 루프 직전에 변수를 선언 할 수도 있다.
        tr.addListener(m_textReporter);
        m_testRunners.add(tr);

        invoker = tr.getInvoker();

        for (ITestNGMethod m : tr.getBeforeSuiteMethods()) {
            beforeSuiteMethods.put(m.getMethod(), m);
        }

        for (ITestNGMethod m : tr.getAfterSuiteMethods()) {
            afterSuiteMethods.put(m.getMethod(), m);
        }
    }

///가로 형식///

        private void measureLine(String line) {
            lineCount++;

            // 흔히 볼 수 있는 코드인데, 할당 연산자 좌우로 공백을 주어 왼쪽,오른쪽 요소가 확실하게 구분된다.
            int lineSize = line.length();
            totalChars += lineSize;

            // 반면 함수이름과 괄호 사이에는 공백을 없앰으로써 함수와 인수의 밀접함을 보여준다
            // 괄호 안의 인수끼리는 쉼표 뒤의 공백을 통해 인수가 별개라는 사실을 보여준다.
            lineWidthHistogram.addLine(lineSize, lineCount);
            recordWidestLine(lineSize);
        }

    public class FitNesseExpediter implements ResponseSender {
        private Socket socket;
        private InputStream input;
        private OutputStream output;
        private Reques request;
        private Response response;
        private FitNesseContex context;
        protected long requestParsingTimeLimit;
        private long requestProgress;
        private long requestParsingDeadline;
        private boolean hasError;
        }
        //정렬이 필요할 정도로 목록이 길다면 문제는 목록의 길이이지 정렬이 부족해서가 아니다. 선언부가 길다는 것은 클래스를 쪼개야 한다는 것을 의미한다.


    //들여쓰기 무시하기
    public class CommentWidget extends TextWidget {
        public static final String REGEXP = "^#[^\r\n]*(?:(?:\r\n)|\n|\r)?";

        public CommentWidget(ParentWidget parent, String text){
            super(parent, text);
        }

        public String render() throws Exception {
            return "";
        }
    }
    //들여쓰기
    public class CommentWidget extends TextWidget {
        public static final String REGEXP = "^#[^\r\n]*(?:(?:\r\n)|\n|\r)?";

        public CommentWidget(ParentWidget parent, String text){
            super(parent, text);
        }

        public String render() throws Exception {
            return "";
        }
    }

    }