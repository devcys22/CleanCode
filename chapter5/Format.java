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

}