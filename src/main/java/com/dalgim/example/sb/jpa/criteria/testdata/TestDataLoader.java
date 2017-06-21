package com.dalgim.example.sb.jpa.criteria.testdata;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.Collection;

/**
 * Created by Mateusz Dalgiewicz on 21.06.2017.
 */
@Component
@Transactional
@RequiredArgsConstructor
public class TestDataLoader implements ApplicationListener<ApplicationReadyEvent> {

    private final Collection<TestDataInitializer> testDataInitializers;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        testDataInitializers.forEach(TestDataInitializer::initialize);
    }
}
