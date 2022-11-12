package com.example.book_cleancode.chapter03;

class SameLevelAbstract {
    public void 외출준비_같은_레벨() {
        씻기();
        밥먹기();
        옷갈아입기();
    }
    public void 외출준비_다른_레벨() {
        씻기();
        밥먹기();
        옷선택하기();
        옷입기();
    }
    private void 씻기() {
    }
    private void 밥먹기() {
    }
    private void 옷갈아입기() {
        옷선택하기();
        옷입기();
    }
    private void 옷입기() {
    }
    private void 옷선택하기() {

    }
}