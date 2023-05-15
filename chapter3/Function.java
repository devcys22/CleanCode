class Function{
//3-1 # 좋지 않은 코드
public static String testableHtml(PageData pageData, boolean includeSuiteSetup)
        throws Exception {

        Wikipage wikipage = pageData.getWikiPage();
        StringBuffer buffer = new StringBuffer();
        if (pageData.hasAttribute("Test")) {
            if (includeSuiteSetup) {
                WikiPage suiteSetup = PageCrawlerlmpl.getlnheritedPage(
                SuiteResponder.SUITE_SETUP_NAME, wikiPage);
            if (suiteSetup != null) {
                wikiPagePath pagePath =
                suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                String pagePathName = PathParser.render(pagePath);
                buffer.append("include -setup .")
                .append(pagePathName)
                .append("\n");
            }
        }
        WikiPage setup =
        PageCrawlerlmpl.getInheritedPage("SetUp", wikiPage);
        if (setup != null) {
                WikiPagePath setupPath =
                wikiPage.getPageCrawler().getFullPath(setup);
                String setupPathName = PathParser.render(setupPath);
                buffer.append("!include -setup .")
                .append(setupPathName)
                .append("\n");
            }
        }
            buffer.append(pageData.getContent());
        if (pageData.hasAttribute("Test")) {
            WikiPage teardown =
            pageCrawlerlmpl.getInheritedPage("TearDown", wikiPage);
        if (teardown != null) {
            WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(teardown);
            String tearDownPathName = PathParser.render(tearDownPath);
                buffer.append("\n")
                .append("!include -teardown .")
                .append(tearDownPathName)
                .append("\n");
        }
        if (includeSuiteSetup) {
            WikiPage suiteTeardown = PageCrawlerlmpl.getlnheritedPage(
                SuiteResponder.SUITE_TEARDOWN_NAME,
                wikiPage
        );
        if (suiteTeardown != null) {
            Wikipagepath pagePath =
                suiteTeardown.getPageCrawler().getFullPath (suiteTeardown);
            String pagePathName = PathParser.render(pagePath);
                buffer.append("!include -teardown .")
                .append(pagePathName)
                .append("\n");
               }
            }
        }
            pageData.setContent(buffer.toString());
                return pageData.getHtml();
        }
        // # 위 코드의 문제점 해결
    public abstract class Employee {
        public abstract boolean isPayday();
        public abstract Money calculatePay();
        public abstract void deliverPay(Money pay);
    }

    public interface EmployeeFactory {
        public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
    }

    public class EmployeeFactoryImpl implements EmployeeFactory {
        public Employee makeEmployee(EmployeeRecord r) throws InavalidEmployeeType {
            switch (r.type){
                case COMMISSIONED:
                    return new CommissionedEmployee(r);
                case HOURLY:
                    return new HourlyEmployee(r);
                case SALARIED:
                    return new SalariedEmployee(r);
                default:
                    throw new InvalidEmployeeType(r.type);
            }
        }
    }

  //  # 위에 import 부분 생략; 올바른 함수 작성법

    public class SetUpTeardownIncluder{
        private PageData pageData;
        private boolean isSuite;
        private WikiPage testPage;
        private StringBuffer newPageContent;
        private PageCrawler pageCralwer;

        public static String render(PageData pageData) throws Exception{
            return render(pageData, false);
        }

        public static String render(PageData pageData,boolean isSuite) throws Exception{
            return new SetupTeardownIncluder(pageData).render(isSuite);
        }

        private SetupTeardownIncluder(PageData pageData){
            this.pageData = pageData;
            testPage = pageData.getWikiPage();
            pageCrawler = testPage.getPageCrawler();
            newPageContent = new StringBuffer();
        }

        private string render(boolean isSuite) throws Exception{
            this.isSuite = isSuite;
            if (isTestPage())
                includeSetupAndTeardownPages();
            return pageData.getHtml();
        }

        private boolean isTestPage() throws Exception {
            return pageData.hasAttribute("Test");
        }

        private void includeSetupAndTeardownPages() throws Exception {
            includeSetupPages();
            includePageContent();
            includeTeardownPages();
            updatPageContent();
        }

        private void includeSetupPages() throws Exception {
            if (isSuite)
                includeSuiteSetupPage();
            includeSetupPage();
        }

        private void includeSuiteSetupPage() throws Exception {
            include(SuiteResponder.SUITE_SETUP_NAME, "-setup");
        }

        private void includeSetupPage() throws Exception {
            include("SetUp", "-setup");
        }

        private void includePageContent() throws Exception {
            newPageContent.append(pageData.getContent())
        }

        private void includeTeardownPages() throws Exception {
            includeTearDownPage();
            if (isSuite)
                includeSuiteTeardownPage();
        }

        private void includeTeardownPage(this) throws Exception {
            include("TearDown", "-teardown");
        }

        private void includeSuiteTeardownPage() throws Exception {
            include(SuiteResponder.SUITE_TEARDOWN_NAME, "-teardown");
        }

        private void updatePageContent() throws Exception {
            pageData.setContent(newPageContent.toString());
        }

        private void include(string pageName,string arg) throws Exception {
            WikiPage inheritedPage = findInheritedPage(pageName);
            if (inheritedPage != NULL){
                String pagePathName = getPathNameForPage(inheritedPage);
                buildIncludeDirective(pagePathName, arg);
            }
        }

        private WikiPage findInheritedPage(String pageName) throws Exception {
            return PageCrawlerImpl.getInheritedPage(pageName, testPage);
        }

        private String getPathNameForPage(WikiPage page) throws Exception {
            WikiPagePath pagePath = pageCrawler.getFullPath(page);
            return PathParser.render(pagePath);
        }

        private void buildIncludeDirective(String pagePathName, String arg){
            newPageContent
                    .append("\n!include ");
            .append(arg);
            .append(" .");
            .append(pagePathName);
            .append("\n");
        }

    }
}