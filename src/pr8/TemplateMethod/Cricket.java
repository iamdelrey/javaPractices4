package pr8.TemplateMethod;

class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Игра в крикет инициализирована. Начните игру");
    }

    @Override
    void startPlay() {
        System.out.println("Игра в крикет началась. Наслаждайтесь игрой");
    }

    @Override
    void endPlay() {
        System.out.println("Игра в крикет завершена");
    }
}