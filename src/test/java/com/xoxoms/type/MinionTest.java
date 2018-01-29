package com.xoxoms.type;

import com.xoxoms.core.entity.Minion;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

/**
 * Created by ms on 2018. 1. 28..
 */
public class MinionTest {
    private EntityManagerFactory emf;

    @Before
    public void setUp() {
        emf = Persistence.createEntityManagerFactory("jpa");
    }

    @Test
    public void test() {
        EntityManager em = emf.createEntityManager();

        Minion minion = em.find(Minion.class, 203L);
        assertTrue(minion.getName().equals("티리온 폴드링"));
        System.out.println(minion.getMinionAttributeMaps());
    }
}