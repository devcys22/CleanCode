class Name {

    //어떤 걸 의미하려는지 정확히 알 수 없다.
    public List<int[]> getThem{
        List<intp[]> list1 = new ArrayList<int[]>();
        for(int[] x: theList)
            if(x[0] == 4)
                list1.add(x);
        return list1;
    }

    //함수가 하는 일에 대한 이해가 쉬워졌다
    public List<int[]> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayLisst<Cell>();
        for(Cell cell : gameBoard)
            if(cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;

    }
}