package com.ashokit.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TicketBookingSystem {

    private final Map<String, Integer> tickets = new HashMap<>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public TicketBookingSystem() {
        tickets.put("Economy", 50);
        tickets.put("Business", 20);
    }

    public int getAvailableTickets(String ticketType) {
        lock.readLock().lock(); // Acquire the read lock
        try {
            return tickets.getOrDefault(ticketType, 0);
        } finally {
            lock.readLock().unlock(); // Release the read lock
        }
    }

    public boolean bookTicket(String ticketType, int quantity) {
        lock.writeLock().lock(); // Acquire the write lock
        try {
            int availableTickets = tickets.getOrDefault(ticketType, 0);
            if (availableTickets >= quantity) {
                tickets.put(ticketType, availableTickets - quantity);
                return true;
            } else {
                return false;
            }
        } finally {
            lock.writeLock().unlock(); // Release the write lock
        }
    }

    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem();

        // Multiple readers
        new Thread(() -> {
            System.out.println("Available economy tickets: " + bookingSystem.getAvailableTickets("Economy"));
        }).start();

        new Thread(() -> {
            System.out.println("Available business tickets: " + bookingSystem.getAvailableTickets("Business"));
        }).start();

        // Single writer
        new Thread(() -> {
            boolean success = bookingSystem.bookTicket("Economy", 2);
            System.out.println("Booking status: " + success);
        }).start();
    }
}

