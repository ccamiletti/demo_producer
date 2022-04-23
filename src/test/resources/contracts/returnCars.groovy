package contracts
import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description 'Should return one car in a list'
    request {
        method GET()
        url '/cars-consumer'
    }
    response {
        status OK()
        body '''\
           {
                "id": 1,
                "color": "TEST",
                "model": "Mustang",
                "brand": "AUDI"
           }
        '''

        bodyMatchers {
            jsonPath('$.color', byRegex(nonBlank()))
            jsonPath('$.model', byRegex(nonBlank()))
            jsonPath('$.brand', byRegex(nonBlank()))
        }

        headers {
            contentType('application/json')
        }
    }
}