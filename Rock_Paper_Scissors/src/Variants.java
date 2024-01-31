enum Variants {
    КАМЕНЬ(0),
    НОЖНИЦЫ(1),
    БУМАГА(2);

    private int codeVariant;

    Variants (int codeVariant) {

        this.codeVariant = codeVariant;
    }

    int getCodeVariant () {

        return codeVariant;
    }
}
