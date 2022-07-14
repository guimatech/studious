# Studious

[![Gitpod Ready-to-Code](https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/guimatech/studious)
[![Build Status](https://travis-ci.com/guimatech/studious.svg?branch=main)](https://travis-ci.com/github/guimatech/studious)
[![Coverage Status](https://coveralls.io/repos/github/guimatech/studious/badge.svg?branch=main)](https://coveralls.io/github/guimatech/studious?branch=main)
[![Maintainability](https://api.codeclimate.com/v1/badges/f72405b36bba26af91d6/maintainability)](https://codeclimate.com/github/guimatech/studious/maintainability)

## O que é esse projeto?

Aplicação de gestão de grupos estudantis, eventos e finanças feita com [Spring](https://spring.io/).
Ela tem o propósito de centralizar informações relacionadas ao setor, como: agenda, finanças(agendas de plantão, saldo atual, relatórios de entradas e saídas), secretária (Cadastro de alunos e pais, diário de frequência, notas).

Read this in other languages: [English](README-en.md).

## Recursos extras usados no Gitpod

- [Área de trabalho postgres com gerenciador de banco de dados integrado](https://github.com/marcopeg/docker-images/tree/master/gitpod-workspace-postgres)

## Endpoints

| Helper                  | HTTP Verb | Path                     |
|-------------------------|-----------|--------------------------|
| attendance_diaries_path | GET       | /attendance_diaries      |
|                         | POST      | /attendance_diaries      |
| attendance_diary_path   | GET       | /attendance_diaries/{id} |
|                         | PATCH     | /attendance_diaries/{id} |
|                         | PUT       | /attendance_diaries/{id} |
|                         | DELETE    | /attendance_diaries/{id} |
| lessons_path            | GET       | /lessons                 |
|                         | POST      | /lessons                 |
| lesson_path             | GET       | /lessons/{id}            |
|                         | PATCH     | /lessons/{id}            |
|                         | PUT       | /lessons/{id}            |
|                         | DELETE    | /lessons/{id}            |
| students_path           | GET       | /students                |
|                         | POST      | /students                |
| student_path            | GET       | /students/{id}           |
|                         | PATCH     | /students/{id}           |
|                         | PUT       | /students/{id}           |
|                         | DELETE    | /students/{id}           |
| teachers_path           | GET       | /teachers                |
|                         | POST      | /teachers                |
| teacher_path            | GET       | /teachers/{id}           |
|                         | PATCH     | /teachers/{id}           |
|                         | PUT       | /teachers/{id}           |
|                         | DELETE    | /teachers/{id}           |
| classrooms_path         | GET       | /classrooms              |
|                         | POST      | /classrooms              |
| classroom_path          | GET       | /classrooms/{id}         |
|                         | PATCH     | /classrooms/{id}         |
|                         | PUT       | /classrooms/{id}         |
|                         | DELETE    | /classrooms/{id}         |
| disciplines_path        | GET       | /disciplines             |
|                         | POST      | /disciplines             |
| discipline_path         | GET       | /disciplines/{id}        |
|                         | PATCH     | /disciplines/{id}        |
|                         | PUT       | /disciplines/{id}        |
|                         | DELETE    | /disciplines/{id}        |
| churches_path           | GET       | /churches                |
|                         | POST      | /churches                |
| church_path             | GET       | /churches/{id}           |
|                         | PATCH     | /churches/{id}           |
|                         | PUT       | /churches/{id}           |
|                         | DELETE    | /churches/{id}           |
| responsibles_path       | GET       | /responsibles            |
|                         | POST      | /responsibles            |
| responsible_path        | GET       | /responsibles/{id}       |
|                         | PATCH     | /responsibles/{id}       |
|                         | PUT       | /responsibles/{id}       |
|                         | DELETE    | /responsibles/{id}       |
| events_path             | GET       | /events                  |
|                         | POST      | /events                  |
| event_path              | GET       | /events/{id}             |
|                         | PATCH     | /events/{id}             |
|                         | PUT       | /events/{id}             |
|                         | DELETE    | /events/{id}             |