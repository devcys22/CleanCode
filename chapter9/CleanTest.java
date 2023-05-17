CleanTest{
//9-2
public void testGetPateHierarchyAsXml() throws Exception{
    makePages("PageOne", "PageOne.ChildOne", "PageTwo");

    submitRequest("root", "type:pages");

    assertResponseIsXML();
    assertResponseContains(
        "<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>"
        );
}

public void testSymbolicLinksAreNotInXmlPageHierarchy() throws Exception{
    WikiPage page = makePage("PageOne");
    makePages("PageOne.ChildOne", "PageTwo");

    addLinkTo(page, "PageTwo", "SymPage");

    submitRequest("root", "type:pages");

    assertReponseIsXML();

    assertResponseContains("<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>");
    assertReponseDoesNotContain("SymPage");
}

public void testGetDataAsXml() throws Exception{
    makePageWithContent("TestPageOne", "test page");
    submitRequest("TestPageOne", "type:data");

    assertResponseIsXML();
    assertResponseContains("test page", "<Test");
}


}