package org.example.clientsservice.controllers;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.val;
import org.example.clientsservice.dto.ClientsInfo;
import org.example.clientsservice.service.ClientsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientsControllers {

    final ClientsService service;

    @PostMapping("/api/v1/getClient")
    public ResponseEntity<List<ClientsInfo>> getClients() {
        val clients = service.getClients();
        if (clients.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(clients);
    }

    @PostMapping("/api/v1/getClient/{id}")
    public ResponseEntity<ClientsInfo> getClient(@PathVariable String clientId) {
        val client = service.getClient(clientId);
        if (client != null) {
            return ResponseEntity.ok(client);
        }
        return ResponseEntity.notFound().build();

    }
}
