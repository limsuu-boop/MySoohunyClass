## 수현의 모바일 앱 수업 작품


![](./images/img.png)

## 📱 간단한 계산기 (Simple Calculator)

이 앱은 **Jetpack Compose**를 이용해 만든 **기초 사칙연산 계산기**입니다.  
두 개의 숫자를 입력하고, 버튼을 눌러 더하기·빼기·곱하기·나누기를 할 수 있습니다.  
결과는 버튼 클릭 즉시 화면에 표시됩니다.

---

### 🧩 주요 기능
- ✏️ 숫자 2개 입력 후 `+`, `-`, `×`, `÷` 연산 수행
- ⚠️ 잘못된 입력 시 “숫자를 입력하세요” 안내
- 🚫 0으로 나눌 경우 경고 메시지 표시
- 👀 Compose Preview 기능으로 UI 미리보기 지원

---

### 🧱 사용 기술
- **Kotlin**
- **Jetpack Compose (Material3)**
- **Android Studio**
- **MVVM 없이 단순 상태 관리 (`remember`, `mutableStateOf`)**

---

### 🖥️ UI 구성
- `OutlinedTextField` : 숫자 입력창
- `Button` : 연산 버튼
- `Text` : 결과 표시
- `Column`, `Row` : 간격과 정렬

---

### 🚀 개선 아이디어
- “AC(모두 지우기)” 버튼 추가
- 계산 내역 저장 기능
- 다크모드 지원
- 소수점 자리수 조절 기능

---

### 👩‍💻 제작자
**임수현 (Soohyun)**  
Android Jetpack Compose 학습 프로젝트 중 하나입니다.
