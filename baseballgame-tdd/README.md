# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항
- 사용자는 상대방(컴퓨터)이 생각하고 있는 3자리의 숫자를 유추하여 입력한다.
- 상대방(컴퓨터)은 사용자가 입력한 숫자를 판단해 결과를 출력한다.
    1. 같은 수가 같은 자리에 있으면 스트라이크
    2. 같은 수가 다른 자리에 있으면 볼
    3. 같은 자리가 전혀 없으면 낫싱
- 3자리의 숫자가 모두 일치하는 경우 게임이 종료된다.
- 게임이 종료된 후 새로운 게임을 시작하거나 완전히 종료할 수 있다.
- 사용자가 잘못된 값을 입력할 경우 [ERROR]로 시작하는 메시지를 출력하고 다시 입력할 수 있어야 한다.