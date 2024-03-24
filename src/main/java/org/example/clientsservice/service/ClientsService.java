package org.example.clientsservice.service;

import org.example.clientsservice.dto.ClientsInfo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ClientsService {
    private HashMap<String, ClientsInfo> hashMap;

    public ClientsService() {
        hashMap = new HashMap<>();


        hashMap.put("123-QEW", createClients1());
        hashMap.put("123-EWQ", createClients2());
        hashMap.put("123-DSA", createClients3());
        hashMap.put("123-ASD", createClients4());
        hashMap.put("123-CXZ", createClients5());
    }

    public List<ClientsInfo> getClients() {
        return new ArrayList<>(hashMap.values());
    }

    public ClientsInfo getClient(String clientId) {
        return hashMap.get(clientId);
    }

    private ClientsInfo createClients1() {
        return ClientsInfo.builder()
                .clientId("123-QEW")
                .name("Иван")
                .middleName("Иванов")
                .surname("Иванович")
                .birthday(LocalDate.of(2002, 1, 12))
                .phone("79043791223").build();
    }

    private ClientsInfo createClients2() {
        return ClientsInfo.builder()
                .clientId("123-EWQ")
                .name("Петр")
                .middleName("Петров")
                .surname("Петрович")
                .birthday(LocalDate.of(2000, 11, 12))
                .phone("79053791777").build();
    }

    private ClientsInfo createClients3() {
        return ClientsInfo.builder()
                .clientId("123-DSA")
                .name("Елена")
                .middleName("Сидорова")
                .surname("Александровна")
                .birthday(LocalDate.of(1990, 3, 17))
                .phone("79126591227").build();
    }

    private ClientsInfo createClients4() {
        return ClientsInfo.builder()
                .clientId("123-ASD")
                .name("Иван")
                .middleName("Иванов")
                .surname("Иванович")
                .birthday(LocalDate.of(1990, 6, 11))
                .phone("79043793223").build();
    }

    private ClientsInfo createClients5() {
        return ClientsInfo.builder()
                .clientId("123-CXZ")
                .name("Иван")
                .middleName("Иванов")
                .surname("Иванович")
                .birthday(LocalDate.of(1990, 10, 1))
                .phone("79148891227").build();
    }
}
