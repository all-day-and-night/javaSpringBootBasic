

package hello.hellospring;



import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;


/*
* 유동적으로 DB를 바꿀때 사용하면 좋음, DB이외에도 적용가능
*/
@Configuration
public class SpringConfig {

    /*
    private final DataSource dataSource;


    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }
    */

    // JPA
    /*
    private final EntityManager em;
    private final DataSource datasource;

    @Autowired
    public SpringConfig(DataSource datasource, EntityManager em){
        this.datasource = datasource;
        this.em = em;
    }
    */
    
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    //@Bean
    //public MemberRepository memberRepository(){

        //return new JpaMemberRepository(em);
        //return new JdbcTemplateMemberRepository(dataSource);
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
    //}

}
