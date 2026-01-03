WITH ConsecutiveNumAnalysis
AS (
	SELECT Id
		,Num AS CurrNum
		,lag(Num) OVER (
			ORDER BY Id
			) AS PrevNum
		,lead(Num) OVER (
			ORDER BY Id
			) AS NextNum
	FROM Logs
	)
SELECT DISTINCT CurrNum AS ConsecutiveNums
FROM ConsecutiveNumAnalysis
WHERE CurrNum = PrevNum
	AND CurrNum = NextNum