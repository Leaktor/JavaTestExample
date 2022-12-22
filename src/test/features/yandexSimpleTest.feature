#language:ru

Функционал: Тестирование главной страницы яндекса

  @test
  Сценарий: Ввод корректных данных в поисковую строку яндекса
    Дано Открыть страницу "ya.ru"
    Если Ввести "тест" в строку поиска
    И Нажать кнопку Ввод
    Тогда Проверить что количество карточек в выдаче больше 0