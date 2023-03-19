/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bam.deployers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class deployApp {

    @Autowired
    private RestTemplate restTemplate;

    public boolean get(String myBPMN) {

        try {
            restTemplate.getForObject("http://localhost:3000/deploy-server", boolean.class);
            System.out.println("Reponse Successful");
            return true;
        } catch (RestClientException e) {
            System.out.println("Response error");
            return false;
        }
    }

}