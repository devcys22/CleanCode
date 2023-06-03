public class Version {
    public int getMajorVersionNumber()
    public int getMinorVersionNumber()
    public int getBuildNumber()
}

// SuperDashboard.java에서 Version이라는 클래스를 만들어준다.
// 이렇게 만든 Version의 경우 버전이 바뀌는 것이 클래스 변경의 이유가 되며, 다른 곳에서 재사용 하기도 쉬운 구조가 된다.
//
//- SRP는 중요한 개념이고, 이해하고 지키기 수원한 개념이지만 가장 많이 무시되는 규칙이기도 하다.