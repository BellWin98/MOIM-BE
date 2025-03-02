package com.team1.moim.domain.group.repository;

import com.team1.moim.domain.group.entity.Group;
import com.team1.moim.domain.group.entity.GroupInfo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupInfoRepository extends JpaRepository<GroupInfo, Long> {
    List<GroupInfo> findByGroup(Group group);
    List<GroupInfo> findByGroupAndIsAgreed(Group group, String isAgreed);
}
