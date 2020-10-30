package tom6502servicedi

import grails.gorm.services.Service
import org.springframework.beans.factory.annotation.Autowired

@Service(Author)
abstract class AuthorService {

    @Autowired
    ImportService importService

    abstract Author get(Serializable id)

    abstract List<Author> list(Map args)

    abstract Long count()

    abstract void delete(Serializable id)

    abstract Author save(Author author)

    int getSomeNumberFromImportService() {
        importService.someNumber
    }
}