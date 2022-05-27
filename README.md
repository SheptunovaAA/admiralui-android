# Admiral UI Kit ![version](https://img.shields.io/badge/dynamic/json.svg?label=release&url=https://raw.githubusercontent.com/admiral-team/admiralui-android/main/version.json&query=$.external_version)

Библиотека визуальных компонентов для `Android`

<p align="center">
<img src="/docs/readme-preview.gif?raw=true" align="middle">
</p>

## Что такое UI Kit?
**UI Kit** - это готовый набор элементов пользовательского интерфейса. 

### Плюсы использования UI Kit:
- Позволяет придерживаться единого визуального стиля и интерфейсных решений
- Ускоряет прототипирование
- Экономит время дизайнеров и разработчиков

## Почему Admiral UI Kit?

- 💎 **Множество готовых компонентов** - 30+ компонентов на базе `Android View` от кнопок и текстовых полей до таймпикера и календаря. *Компоненты на базе `Compose` находятся в разработке.*
- 🛠 **Кастомизируемость** - компоненты имеют множество настраиваемых свойств.
- 🎨 **Темизация** - поддержка разных цветовых палитр, возможность создания собственных и мгновенное переключение между ними.
- 🏗 **Поддержка** - релизы выходят раз в две недели.
- 📱 **Единый стиль на разных платформах** - есть библиотека под [iOS](https://github.com/admiral-team/admiralui-ios)
- 📄 **Лицензия** - *TODO..*

## Демо приложение
Живым примером использования библиотеки `Admiral UI Kit` является наше демо-приложение. С ним вы сможете оценить все реализованные в библиотеке компоненты в разных стейтах, с возможностью переключения встроенных цветовых тем и созданию собственных.

#### Запуск демо приложения
- Склонировать репозиторий `git@github.com:admiral-team/admiralui-android.git`
- Переключиться на `main` ветку
- В Android Studio запустить demo на эмуляторе или на реальном девайсе

## Язык и версия API
- Основной язык разработки `Kotlin`
- Минимально поддерживаемая версия Android: `API 21`

## Подключение
Поддерживается два способа подключения: `GitHubPackages` и `MavenLocal`.
Детали подключения библиотеки в [wiki](https://github.com/admiral-team/admiralui-android/wiki/%D0%9F%D0%BE%D0%B4%D0%BA%D0%BB%D1%8E%D1%87%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B1%D0%B8%D0%B1%D0%BB%D0%B8%D0%BE%D1%82%D0%B5%D0%BA%D0%B8).

## Использование компонентов

### Добавление компонента конпки
```
<com.admiral.uikit.components.button.Button
   android:id="@+id/btnPrimaryBig"
   android:layout_width="match_parent"
   android:layout_height="wrap_content"
   android:text="Big primary button"
   app:admiralButtonSize="big"
   app:admiralButtonStyle="primary" />
```

Примеры использования всех остальных компонентов можно посмотреть в [исходниках](https://github.com/admiral-team/admiralui-android/tree/develop/demo) демо приложения.

Дополнительная инструкция по использованию компонентов в [readme](docs/COMPONENTS_USAGE.md).

## Генерация документации
Все публичные методы и классы задокументированы. Вы так же можете сгенерировать документацию к коду с помощью плагина [Dokka](https://github.com/Kotlin/dokka).

## Контрибьютерам
Мы рады любой помощи, и вы можете помочь нам с развитием этого проекта. Подробности в [wiki](https://github.com/admiral-team/admiralui-android/wiki/%D0%9A%D0%BE%D0%BD%D1%82%D1%80%D0%B8%D0%B1%D1%8C%D1%8E%D1%82%D0%B5%D1%80%D0%B0%D0%BC).

## Команда проекта
<table>
  <tr>
    <td align="center"><a href="https://github.com/ton252"><img src="https://avatars.githubusercontent.com/u/13065321?v=4" width="80px;" alt="" /><br /><sub><b>Поляков Антон</b></sub></a><br /><a href="https://github.com/admiral-team/admiralui-android/commits?author=ton252" title="Code">👑</a></td>
    <td align="center"><a href="https://github.com/timbaton"><img src="https://avatars.githubusercontent.com/u/20974161?v=4" width="80px;" alt="" /><br /><sub><b>Бадретдинов Тимур</b></sub></a><br /><a href="https://github.com/admiral-team/admiralui-android/commits?author=timbaton" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/Samuel-Unknown"><img src="https://avatars.githubusercontent.com/u/4298267?v=4" width="80px;" alt="" /><br /><sub><b>Бабакаев Семён</b></sub></a><br /><a href="https://github.com/admiral-team/admiralui-android/commits?author=Samuel-Unknown" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/Evgeniy-93"><img src="https://avatars.githubusercontent.com/u/101252323?v=4" width="80px;" alt="" /><br /><sub><b>Круцкий Евгений</b></sub></a><br /><a href="https://github.com/admiral-team/admiralui-android/commits?author=Evgeniy-93" title="Code">🛠</a></td>
  </tr>
</table>
