//勇者インスタンスを受け取り、そのHPを返す
(Hero h) -> {return h.getHp();}
//何も受け取らず、現在日時を返す
() -> {return new java.util.Date();}
//long配列を受け取り、そのコピーを作り、内容を並び替えて返す
(long[] array) -> {
    long[] array2 = java.util.Arrays.copyOf(array, array.length);
    java.util.Arrays.sort(array2);
    return array2;
}

//関数オブジェクトを受け取り、2回呼び出した合計を返す
(IntBinaryOperator func, int a, int b) -> {
    int result = func.applyAsInt(a, b) + func.applyAsInt(a, b);
    return result;
}