-- 코드를 작성해주세요
select C.id, C.genotype, P.genotype as parent_genotype from ecoli_data P
join ecoli_data C on P.id = C.parent_id
where C.genotype & P.genotype = P.genotype
order by C.id