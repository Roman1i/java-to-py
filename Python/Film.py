class Film:
    count = 0
    films = []


    def __init__(self, name, dur, date, genre, prod):
        self.name = name
        self.duration = dur
        self.date = date
        self.genre = genre
        self.producer = prod
        self.id = Film.count
        Film.count = self.id + 1
        Film.films.append(self)
    

    def info(self):
        print("id: {0}   Name: {1}; Duration: {2} min; Date: {3}; Genre: {4}; Producer: {5}".format(self.id, self.name, self.duration, self.date, self.genre, self.producer))

    
    def print(self):
        print("id: {0}   Name: {1}; Duration: {2} min; Date: {3}; Genre: {4}; Producer: {5}".format(self.id, self.name, self.duration, self.date, self.genre, self.producer))
    

PF = Film("Pulp Fiction", 165, 1994, "Criminal, Drama", "Quentin Tarantino")
Alien = Film("Alien", 111, 1979, "Sci-Fi, Horror", "Ridley Scott")
VDN = Film("Vase de noces", 80, 1974, "Horror, Drama", "Thierry Zeno")


flag = True

while flag:
    print("\n1. Поиск\n2. Список фильмов\n3. Выйти\n\nВведите номер: ")
    operation = input()
    match operation:
        case '1':
            print("Введите название:")
            req = input()
            print('\nРезультаты по запросу "{0}"":'.format(req))
            for film in Film.films:
                if req.lower() in film.name.lower():
                    film.info()
        case '2':
            print("\nСписок фильмов:")
            for film in Film.films:
                film.info()
        case '3':
            flag = False



