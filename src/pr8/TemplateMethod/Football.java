package pr8.TemplateMethod;


class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Футбольная игра инициализирована. Начните игру");
    }

    @Override
    void startPlay() {
        System.out.println("Футбольная игра началась. Наслаждайтесь игрой");
    }

    @Override
    void endPlay() {
        System.out.println("Футбольная игра завершена");
    }
}